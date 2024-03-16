
package InterfaceOrnek;

public class Interface {
//bizden istenen şey şu projemizin birden fazla veri 
//tabanını desteklemesi ve yeni veri tabanlarını desteklemeye
//açık olacak.(sql,oracle vb.)
//kodun güncellenmesi değiştirilmesi kolay olacak.
    public static void main(String args[]) {
        
//    MySqlDatabase mySQL = new MySqlDatabase();
//    mySQL.add();
//    mySQL.delete();
//    mySQL.insert();     //biz vazgeçtik mySQL yerine
//    mySQL.update();     // MsSQl yapıcaz dediler. ne olacak?
                        //tek tek hepsini değiştirip yeniden
                        //newleme mi yapıaz ? çok zor olmaz mı?
        // burdada polymorhism kullanıcaz.
        
//     ↓↓↓   newledik nesnesini hayata getirdik ↓↓↓
        
    DataBaseManager databasemanager = new DataBaseManager();
    databasemanager.addDatabase(new MySqlDatabase());
    //nesnemi parantezin içerisinde oluşturdum.
    databasemanager.deleteDatabase(new MySqlDatabase());
    databasemanager.updateDatabase(new MsSqlDataBase());
    
                        
                        
    }
}
