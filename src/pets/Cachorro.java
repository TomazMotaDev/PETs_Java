package pets;

public class Cachorro extends Animais{
    @Override
    public void dormir(){        
        int rand = random.nextInt(0,100);
        
        if (rand >= 0 && rand < 34){
            System.out.println(this.getNome()+" dormiu por um tempo e recuperou suas energias.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" dormiu de barriga para cima. Você tirou uma foto.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" está dormindo enrolado no cobertor barato que ganhou.");
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
            System.out.println(this.getNome()+" comeu sua ração e lambeu os beiços.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" comeu como se não houvesse amanhã.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" estava com muita fome. Engoliu toda a ração.");
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
            System.out.println(this.getNome()+" correu atrás da bola por um tempo.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" trouxe várias varetas para você jogar.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" correu atrás do próprio rabo até cansar.");
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
            System.out.println(this.getNome()+" tomou seu banho e agora cheira a ervas finas.");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" fugiu três vezes até você conseguir dar banho. Agora está mais limpo que o próprio sabão.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" deixou de feder a carniça com ovo podre.");
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
            System.out.println(this.getNome()+" evacoou e está livre leve e solto(a).");
        }else if(rand >= 34 && rand < 66){
            System.out.println(this.getNome()+" correu para a esquina para evacuar.");
        }else if(rand >= 66 && rand < 101){
            System.out.println(this.getNome()+" evacoou e deixou um cheiro nefasto, mesmo só comendo ração.");
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
    }

    @Override
    public void imgIdle() {
        System.out.println("   ,-.___,-.");
        System.out.println("   \\_/_ _\\_/");
        System.out.println("     )O_O(");
        System.out.println("    { (_) }");
        System.out.println("     `-^-'   hjw");
    }

    @Override
    public void imgDormindo() {
        System.out.println("      .-------------.    *  .    .   *       *   ");
        System.out.println("     /_/_/_/_/_/_/_/ \\ .    '   * z       .   )    .");
        System.out.println("    //_/_/_/_/_/_// _ \\        z     .        .   ");
        System.out.println("   /_/_/_/_/_/_/_/|/ \\        Z   '         ");
        System.out.println("    |             ||  |  __   Z      *       ");
        System.out.println("    |             ||  |.' .`-o________________|       ");
        System.out.println("    |             ||-'(/ ,--'                 |         ");
        System.out.println("    |_____________||  ___b                    |  hjm");
    }

    @Override
    public void imgComendo() {
        System.out.println("       ,    --.");
        System.out.println("      ((___/ \\__>");
        System.out.println("      /     \\/}");
        System.out.println("      \\ .--.(    ___");
        System.out.println("   jgs \\\\   \\\\  /___\\");
    }

    @Override
    public void imgBrincando() {
        System.out.println("                                  _");
        System.out.println("                               (\\ \\)");
        System.out.println("                             o__^\\/     ,");
        System.out.println("                              \\ ' \\    <   _  _");
        System.out.println("    .                          `|  \\____\\   -   -");
        System.out.println("      '      . .      ()        |        )  _   _");
        System.out.println("        `.'       `.'         .//---_/-_/ _  _");
    }

    @Override
    public void imgBanhando() {
        System.out.println(" o ,-.___,-.");
        System.out.println("   \\_/_ _\\_/ O");
        System.out.println("   O )O_O(");
        System.out.println("    { (_) }  o");
        System.out.println("  o  `-^-'   hjw/TM");
    }

    @Override
    public void imgEvacuando() {
        System.out.println("                            (\\");
        System.out.println("                           (\\_\\_^__o");
        System.out.println("  ~    .            ___     `-'/ `_/");
        System.out.println("    .    '          '`--\\______/  |");
        System.out.println("      ~               /         |");
        System.out.println("        .  `          -`/.------'\\^-'");
        System.out.println("       {_}");
    }
}
