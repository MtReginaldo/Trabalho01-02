public class Elevador { 

    public class Posicao{
        private int andar;
	    public int Descer(){
            return(andar-1);
        }
        public int Subir(){
		    return(andar+1);
	    }
    }

    public class Capacidade{
        private int quantidade;
	    public int Sair(){
            return(quantidade-1);
        }
        public int Entrar(){
		    return(quantidade+1);
	    }
    }
}
