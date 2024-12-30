
package InterfaceOrnek;

public class MySqlDatabase implements IDatabase {

    @Override
    public void add() {
        System.out.println("MySQL veri tabanina eklendi.");
    }

    @Override
    public void insert() {
        System.out.println("MySQL verileri gosterildi. ");
    }

    @Override
    public void delete() {
        System.out.println("MySQL veri tabanindan silindi.");
    }

    @Override
    public void update() {
        System.out.println("MySQL veri tabaninda guncellendi");
    }
    

  
}
