
package InterfaceOrnek;

public class MsSqlDataBase implements IDatabase{

    @Override
    public void add() {
        System.out.println("MsSQL veri tabanina eklendi.");
    }

    @Override
    public void insert() {
        System.out.println("MsSQL verileri gosterildi.");
    }

    @Override
    public void delete() {
        System.out.println("MsSQL verilerinden silindi.");
    }

    @Override
    public void update() {
        System.out.println("MsSQL verileri guncellendi.");
    }
    
    
}
