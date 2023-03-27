class DogRobo
{
 String breed;
 String color;
 String name;
 
 public void bark()
 {
  System.out.println("Woof woof");
 }
 public void play()
 {
  System.out.println("Play fetch");
 }

 DogRobo(String breed,String color ,String name)
 {
  this.breed=breed;
  this.color=color;
  this.name=name;
 }

}