package heranca02;

public class AutmovelDeLuxo extends Automovel {
    private byte camera_de_re;
    private byte airbag;

    AutmovelDeLuxo(String m, String c, byte comb) {
        super(m, c, comb);
    }
    
    @Override
    public byte quantasPrestacoes() {
        return (byte)(super.quantasPrestacoes()+12);
    }

    public byte getCamerasDeRe(){
        return camera_de_re;
    }

    public byte getAirbags(){
        return airbag;
    }

    public void setAirbags(byte qtd){
        this.airbag = qtd;
    }
}
