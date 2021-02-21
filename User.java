
public class User {
    ///////////////////////////TOOLS///////////////////////////
    String ID           ;
    String name         ;
    String surname      ;
    String password     ;
   

    /////////////////////////// CONSTRUCTOR///////////////////////////
    public User(String ID, String name, String surname, String password) {
        this.ID         = ID;
        this.name       = name;
        this.surname    = surname;
        this.password   = password;
        

    }

    /////////////////////////// BEHAVİOURS///////////////////////////

    //This method shows user's info except password
    public void show_user() {
        System.out.println("Name        : " + this.name);
        System.out.println("Surname     : " + this.surname);
        System.out.println("ID          : " + this.ID);

    }


    ///////////////////////////GETTER & SETTER///////////////////////////

    public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
    
}
