package pets;

import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String repetir = "", escolha, nome, sexo;
        byte menu = 0;
        Animais pet = null;
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("> Seja bem vindo(a) ao Pets, seu animal virtual de extimação.");
        System.out.println("> Seu único objetivo é não deixar seu pet cair para o limbo da MATRIX.");
        System.out.println("> Boa sorte nesta missão.");
        System.out.println("----------------------------------------------------------------------\n");
        
        do{
            System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<");
            System.out.println("    CRIAÇÃO DO SEU PET   ");
            System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<\n");
            
            System.out.println("Qual pet deseja escolher: [G]ato | [C]achorro");
            escolha = in.nextLine().toUpperCase();
            
            while (!escolha.equals("G") && !escolha.equals("C")){
                System.out.println("Favor escolher as inicias de cada opção: (G/C)");
                escolha = in.nextLine().toUpperCase();
            }
                                    
            System.out.println("\nQual o nome do seu pet?");
            nome = in.nextLine();
            
            System.out.println("\nQual o gênero do seu pet?");
            sexo = in.nextLine();
            
            switch (escolha){
                case "G":
                    pet = new Gato();
                    pet.setNome(nome);
                    pet.setSexo(sexo);
                    break;
                case "C":
                    pet = new Cachorro();
                    pet.setNome(nome);
                    pet.setSexo(sexo);
                    break;
            }
            
            pet.atualizarStatus();
            pet.imgIdle();
            
            do{
                System.out.println("\n--- Escolha uma das opções abaixo ---");
                System.out.println("1- Dormir | 2- Comer | 3- Brincar | 4- Tomar Banho\n5- Evacuar | 6- Limpar | 7- Sair");
                menu = in.nextByte();
                
                switch(menu){
                    case 1:
                        pet.dormir();
                        pet.atualizarStatus();
                        pet.dicas();
                        pet.imgDormindo();
                        break;
                    case 2:
                        pet.comer();
                        pet.atualizarStatus();
                        pet.dicas();
                        pet.imgComendo();
                        break;
                    case 3:
                        pet.brincar();
                        pet.atualizarStatus();
                        pet.dicas();
                        pet.imgBrincando();
                        break;
                    case 4:
                        pet.banhar();
                        pet.atualizarStatus();
                        pet.dicas();
                        pet.imgBanhando();
                        break;
                    case 5:
                        pet.evacuar();
                        pet.atualizarStatus();
                        pet.dicas();
                        pet.imgEvacuando();
                        break;
                    case 6:                        
                        pet.limpar();
                        pet.atualizarStatus();
                        pet.dicas();
                        pet.imgIdle();
                        break;
                    case 7:
                        System.out.println("Obrigado por jogar Pets. Nos vemos no próximo jogo.");
                        repetir = "N";
                        break;
                    default:
                        System.out.println("Favor escolher entre uma das opções do menu:");
                }
                
                if (pet.felicidade() <= 60 && (pet.getFome() <= 10 || pet.getEnergia() <= 10)){
                    System.out.println("      ---***FIM DE JOGO***---");
                    System.out.println("- Seu pet sucumbiu para o limbo da MATRIX. Você se descuidou e seu pet faleceu.");
                    System.out.println("\nDeseja criar um novo PET? [S]im | [N]ão");
                    repetir = in.nextLine().toUpperCase();
                    
                    while (!repetir.equals("S") && !repetir.equals("N")){
                        System.out.println("Favor escolher apenas 'S' ou 'N'.");
                        repetir = in.nextLine().toUpperCase();
                    }
                    
                    menu = 7;
                }
                
            }while(menu != 7);
            
        }while(!repetir.equals("N"));
    }
    
}
