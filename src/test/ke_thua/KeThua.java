package test.ke_thua;

public class KeThua {
    public static void main(String[] args) {
        ChoCon choCon = new ChoCon();
        System.out.println(choCon.tiengKeu());
        System.out.println(choCon.tiengNoi());
    }
}

class ChoMe {
    public String tiengKeu() {
        return "gâu gâu";
    }

}
class ChoCon extends ChoMe implements Nguoi{
    @Override
    public String tiengKeu() {
        return "Ẳng Ẳng";
    }

    @Override
    public String tiengNoi() {
        return "tôi là chó";
    }
}
interface Nguoi{
    String tiengNoi();
}