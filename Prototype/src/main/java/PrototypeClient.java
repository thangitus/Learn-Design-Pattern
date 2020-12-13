class PrototypeClient {
   public static void main(String[] args) {
      Circle circle = new Circle();
      circle.x = 10;
      circle.y = 20;
      circle.radius = 15;
      circle.color = "red";
      Circle anotherCircle = (Circle) circle.clone();

   }
}
