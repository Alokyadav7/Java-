// class vehicle {
   /******** private String make;
    private String color;
    private int year;
    private String model;

    private vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void PrintDetail() {
        System.out.println("Manufacturer:" + make);
        System.out.println("Color:" + color);
        System.out.println("Year:" + year);
        System.out.println("Model:" + model);
    }

    class car extends vehicle {
        private String bodyStyle;

        public car(String make, String color, int year, String model, String bodyStyle) {
            super(make, color, year, model);
            this.bodyStyle = bodyStyle;
        }

        public void carDetail() {
            PrintDetail();
            System.out.println("BodyStyle:" + bodyStyle);
        }
        public class main {
            public static void main(String[] args) {
                car elantra = new car ("","","","","");
                elantra.carDetail();
            }
        }
    }
}***/
