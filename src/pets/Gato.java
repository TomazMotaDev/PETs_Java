package pets;

public class Gato extends Animais {
    @Override
    public void dormir(){
        int rand = random.nextInt(0,100);
        
        if (rand >= 0 && rand < 34){
            System.out.println(this.getNome()+" dormiu um pouco, mas se deixar dorme mais ainda.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" dormiu na caixa velha de papelão mesmo com uma cama caríssima ao lado.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" dorme de cansaço de ter dormido o dia todo.");
        }
        
        setEnergia(getEnergia(), 60);
        if (getEnergia() >= 100){
            int sub = getEnergia() - 100;
            setEnergia(getEnergia(), -sub);
        }
        setFome(getFome(), -15);
        if(getFome() <= 0){
            setFome(getFome(), (getFome()*-1));
        }
        setDiversao(getDiversao(), -10);
        if(getDiversao() <= 0){
            setDiversao(getDiversao(), (getDiversao()*-1));
        }
        setBanho(getBanho(),-10);
        if(getBanho() <= 0){
            setBanho(getBanho(), (getBanho()*-1));
        }
        setBanheiro(getBanheiro(), -25);
        if(getBanheiro() <= 0){
            setBanheiro(getBanheiro(), (getBanheiro()*-1));
        }
        
    }
    
    @Override
    public void comer(){
        int rand = random.nextInt(0,100);
        
        if (rand >= 0 && rand < 34){
            System.out.println(this.getNome()+" comeu toda a sua ração de peixe.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" miou e miou até conseguir sua ração.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" não se contentou com a ração, pediu e comeu um sachê de frango.");
        }
        
        setFome(getFome(), 60);
        if (getFome() >= 100){
            int sub = getFome() - 100;
            setFome(getFome(), -sub);
        }              
        setEnergia(getEnergia(), -10);
        if(getEnergia() <= 0){
            setEnergia(getEnergia(), (getEnergia()*-1));
        }        
        setDiversao(getDiversao(), -15);
        if(getDiversao() <= 0){
            setDiversao(getDiversao(), (getDiversao()*-1));
        }
        setBanho(getBanho(),-5);
        if(getBanho() <= 0){
            setBanho(getBanho(), (getBanho()*-1));
        }
        setBanheiro(getBanheiro(), -15);
        if(getBanheiro() <= 0){
            setBanheiro(getBanheiro(), (getBanheiro()*-1));
        }
        
    }
    
    @Override
    public void brincar(){
        int rand = random.nextInt(0,100);
        
        if (rand >= 0 && rand < 34){
            System.out.println(this.getNome()+" não resistiu ao novelo de lã e brincou por um tempo.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" brincou com todas as bolinhas de papel, menos com os brinquedos que ganhou.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" derrubou todas suas canetas da mesa e começou a brincar.");
        }
        
        setDiversao(getDiversao(), 50);
        if (getDiversao() >= 100){
            int sub = getDiversao() - 100;
            setDiversao(getDiversao(), -sub);
        }                    
        setEnergia(getEnergia(), -25);
        if(getEnergia() <= 0){
            setEnergia(getEnergia(), (getEnergia()*-1));
        }        
        setFome(getFome(), -20);
        if(getFome() <= 0){
            setFome(getFome(), (getFome()*-1));
        }  
        setBanho(getBanho(),-15);
        if(getBanho() <= 0){
            setBanho(getBanho(), (getBanho()*-1));
        }
        setBanheiro(getBanheiro(), -10);
        if(getBanheiro() <= 0){
            setBanheiro(getBanheiro(), (getBanheiro()*-1));
        }
    }
    
    @Override
    public void banhar(){
        int rand = random.nextInt(0,100);
        
        if (rand >= 0 && rand < 34){
            System.out.println(this.getNome()+" se labeu por um bom tempo.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" decidiu se lamber no pé do seu ouvido enquanto você tenta dormir.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" se lambeu por um bom tempo para tirar o cheiro de perfume que deixou em seu pêlo.");
        }
        
        setBanho(getBanho(),80);
        if (getBanho() >= 100){
            int sub = getBanho() - 100;
            setBanho(getBanho(), -sub);
        }                  
        setEnergia(getEnergia(), -5);
        if(getEnergia() <= 0){
            setEnergia(getEnergia(), (getEnergia()*-1));
        }        
        setFome(getFome(), -10);
        if(getFome() <= 0){
            setFome(getFome(), (getFome()*-1));
        }  
        setDiversao(getDiversao(), -10);
        if(getDiversao() <= 0){
            setDiversao(getDiversao(), (getDiversao()*-1));
        } 
        setBanheiro(getBanheiro(), -5);
        if(getBanheiro() <= 0){
            setBanheiro(getBanheiro(), (getBanheiro()*-1));
        }
    }
    
    @Override
    public void evacuar(){
        int rand = random.nextInt(0,100);
        
        if (rand >= 0 && rand < 34){
            System.out.println(this.getNome()+" foi a sua caixa de areia e evacuou tudo que tinha.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" após evacuar, enterrou tudo menos seus dejetos.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" evacuou e saiu correndo como se não houvesse amanhã.");
        }
        
        setBanheiro(getBanheiro(), 40);
        if (getBanheiro() >= 100){
            int sub = getBanheiro() - 100;
            setBanheiro(getBanheiro(), -sub);
        }               
        setEnergia(getEnergia(), -5);
        if(getEnergia() <= 0){
            setEnergia(getEnergia(), (getEnergia()*-1));
        }        
        setFome(getFome(), -10);
        if(getFome() <= 0){
            setFome(getFome(), (getFome()*-1));
        }  
        setDiversao(getDiversao(), -15);
        if(getDiversao() <= 0){
            setDiversao(getDiversao(), (getDiversao()*-1));
        } 
        setBanho(getBanho(),-20);
        if(getBanho() <= 0){
            setBanho(getBanho(), (getBanho()*-1));
        } 
        
        setCont(getCont(), 1);
    }

    @Override
    public void imgIdle() {
        System.out.println("    /\\_/\\");
        System.out.println("   ( o.o )");
        System.out.println("    > ^ <");
    }

    @Override
    public void imgDormindo() {
        System.out.println("         |\\      _,,,---,,_");
        System.out.println("   ZZZzz /,`.-'`'    -.  ;-;;,_");
        System.out.println("        |,4-  ) )-,_. ,\\ (  `'-'");
        System.out.println("       '---''(_/--'  `-'\\_)  Felix Lee ");
    }

    @Override
    public void imgComendo() {
        System.out.println("           _..---...,\"\"-._     ,/}/)");
        System.out.println("        .''        ,      ``..'(/-<");
        System.out.println("       /   _      {      )         \\");
        System.out.println("      ;   _ `.     `.   <         a(");
        System.out.println("    ,'   ( \\  )      `.  \\ __.._ .: y __");
        System.out.println("   (  <\\_-) )'-.____...\\  `._   //-' /''\\");
        System.out.println("    `. `-' /-._)))      `-._)))       \\__/");
        System.out.println("      `...'         hjw             ");
    }

    @Override
    public void imgBrincando() {
        System.out.println("       |\\__/,|   (`\\");
        System.out.println("     _.|o o  |_   ) )");
        System.out.println("   -(((---(((--------");
    }

    @Override
    public void imgBanhando() {
        System.out.println("    |\\__/,|   (`\\");
        System.out.println("    |_ _  |.--.) )");
        System.out.println("    ( T   )     /");
        System.out.println("   (((U_(((/(((_/");
    }

    @Override
    public void imgEvacuando() {
        System.out.println("     ,-.       _,---._ __    ");
        System.out.println("    /  )    .-'       `./______");
        System.out.println("   (  (   ,'            `     /|");
        System.out.println("    \\  `-\"             \\'    / |");
        System.out.println("     `.              ,  \\ \\ /  |");
        System.out.println("      /`.          ,'-`----Y   |");
        System.out.println("     (            ;        |   '");
        System.out.println("     |  ,-.    ,-'         |  /");
        System.out.println("     |  | (   |        hjw | /");
        System.out.println("     )  |  \\  `.___________|/");
        System.out.println("     `--'   `--'");
        
    }
}
