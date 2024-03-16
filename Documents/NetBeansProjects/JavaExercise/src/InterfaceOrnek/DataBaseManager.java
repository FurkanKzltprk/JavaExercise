
package InterfaceOrnek;
//burası çok önemli MYSQL den MsSQL geçti tek tek isim 
//değiştirmedim polymorphism ve inheritance kullandım.
// bunlar nesne tabanlı programlamanın temelleri
// çok iyi anlaman gerekiyor başka bir classı 
// nesne olarak kullandık bir nevi ondan kalıtım aldık
// çok biçimli hale getirdik.

public class DataBaseManager {
    public void addDatabase(IDatabase database){
        database.add();
        
    }
    public void insertDatabase(IDatabase database){
        database.insert();
    }
    public void deleteDatabase (IDatabase database){
        database.delete();
        
    }
    public void updateDatabase(IDatabase database){
        database.update();
    }
    
}
