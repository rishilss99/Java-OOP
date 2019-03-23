public class Cars {

    public static void main(String[] args){

        class Car{

            public String brand;
            public int model;
            public String colour;

            public Car(int model,String brand){

                this.model = model;
                this.brand = brand;

            }

            public void setColour(String colour){

                this.colour = colour;

            }

            public String getColour(){
                return colour;
            }
        }

        class Vision{

            public String frontal_face;
            private int number_plate;
            public boolean given_permission;

            public String company;


        }

        Vision v1 = new Vision();

        v1.company = "Benz";

        System.out.println();

        Car benz = new Car(124,"Merc");
        benz.setColour("black");
        System.out.println(benz.getColour());


    }
}
