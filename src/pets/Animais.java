package pets;

import java.util.Random;

public abstract class Animais {
    private int energia = 90, fome = 80, diversao = 80, banho = 85, banheiro = 85, cont = 0;
    private String nome, traco = "|", sexo;
    Random random = new Random();
    
    public int getEnergia (){
        return this.energia;
    }
    
    public void setEnergia (int energia, int valor){
        this.energia = energia + valor;
    }
    
    public int getFome(){
        return this.fome;
    }
    
    public void setFome(int fome, int valor){
        this.fome = fome + valor;
    }
    
    public int getDiversao(){
        return this.diversao;
    }
    
    public void setDiversao(int diversao, int valor){
        this.diversao = diversao + valor;
    }
    
    public int getBanho(){
        return this.banho;
    }
    
    public void setBanho(int banho, int valor){
        this.banho = banho + valor;
    }
    
    public int getBanheiro(){
        return this.banheiro;
    }
    
    public void setBanheiro(int banheiro, int valor){
        this.banheiro = banheiro + valor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getCont(){
        return cont;
    }
    
    public void setCont(int cont, int valor){
        this.cont = cont + valor;
    }
    
    public abstract void dormir();
    public abstract void comer();
    public abstract void brincar();
    public abstract void banhar();
    public abstract void evacuar();
    public abstract void imgIdle();
    public abstract void imgDormindo();
    public abstract void imgComendo();
    public abstract void imgBrincando();
    public abstract void imgBanhando();
    public abstract void imgEvacuando();
    
    public int felicidade(){
        return (energia+fome+diversao+banho+banheiro)/5;
    }
    
    public void dicas(){
        System.out.println("      ***---DICAS---***");
        if(energia > 15 && energia <= 30){
            System.out.println("> Seu pet precisa dormir.");
        }else if(energia < 15){
            System.out.println("> Seu pet está mais próximo de dormir eternamente na MATRIX.");
        }
        if (fome > 15 && fome <= 30){
            System.out.println("> A fome bateu fortemente.");
        }else if (fome < 15){
            System.out.println("> Seu pet clama por comida.");
        }
        if (diversao > 15 && diversao <= 30){
            System.out.println("> O tédio se tornou amigo do seu pet.");
        }else if (diversao < 15){
            System.out.println("> Seu pet olha fixamente para a parede... sem vontade de viver... Brinque com ele agora.");
        }
        if (banho > 15 && banho <= 30){
            System.out.println("> Pelo amor da mãe do Papa, dê banho no seu pet.");
        }else if (banho < 15){
            System.out.println("> O cheiro de carniça misturado com ovo podre e uma pitada de cueca velha mal lavada pairam pela sua casa.");
        }
        if (banheiro <= 30){
            System.out.println("> Seu pet deseja evacuar... Já.");
        }
        if (cont >= 3){
            System.out.println("> A cheiro dos dejetos do seu pet impregna a sua casa. Você não recebe visitas há um bom tempo. Por que será?");
        }
        
    }
    
    public void limpar(){
        this.cont = 0;
        System.out.println("Sua casa cheira agora a flor de rosas.\n");        
    }
    
    public void atualizarStatus(){
        System.out.println("\n---xxx---xxx---xxx---xxx---xxx---xxx---xxx---xxx---xxx---xxx");
        System.out.println("| "+nome+" | "+sexo);
        System.out.println("| Felicidade "+traco.repeat(felicidade()/2));
        System.out.println("============================================================");
        System.out.println("| Energia -- "+traco.repeat(energia/2));
        System.out.println("| Fome ----- "+traco.repeat(fome/2));
        System.out.println("| Diversão - "+traco.repeat(diversao/2));
        System.out.println("| Banho ---- "+traco.repeat(banho/2));
        System.out.println("| Banheiro - "+traco.repeat(banheiro/2));
        System.out.println("---xxx---xxx---xxx---xxx---xxx---xxx---xxx---xxx---xxx---xxx");
    };
}
