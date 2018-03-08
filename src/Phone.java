public class Phone {

    private String phonname;
    private People p;

    Phone(String phonname, People p){
        this.phonname = phonname;
        this.p = p;
    }

    // Записать телефон человека
    public void setPhone(String phonname, People p){
        this.phonname = phonname;
        this.p = p;
    }

    // Показать телефон человека
    public void getPhone(){
        System.out.println(" Телефон:"+this.phonname+" Фамилия"+this.p.hashCode());

    }
}
