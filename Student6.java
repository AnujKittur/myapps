class Student6{
    int id;
    String name;
    Student6(int i,String n){
    id = i;
    name = n;
    }
    
    Student6(int i,string n){
    id =i;
    name =n;
    }
    void display(){System.out.println(id+" "+name);}
 
    public static void main(String args[]){
    Student6 s1 = new Student6(111,"Karan");
    Student6 s2 = new Student6(222,"anuj");
    s1.display();
    s2.display();
   }
}
