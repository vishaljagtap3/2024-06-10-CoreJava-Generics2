public class Main {
    public static void main(String[] args) {

        /*String [] cities = {
                "Mumbai", "Pune", "Ghatanji", "B'lore", "Jaipur", "Delhi"
        };
        Util.sort(cities);
        for(String city : cities) {
            System.out.print(city + " ");
        }
         */
        System.out.println();


        /*Student [] students = new Student[6];
        students[0] = new Student(45, "Sanika", 74);
        students[1] = new Student(34, "Shreya", 93);
        students[2] = new Student(22, "Neha", 81);
        students[3] = new Student(23, "Mansi", 90);
        students[4] = new Student(10, "Viraj", 78);
        students[5] = new Student(39, "Parth", 82);

        Util.sort(students);

        for(Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        Product [] products = new Product[5];
        products[0] = new Product(4569, "Smart Phone", 10353);
        products[1] = new Product(2390, "Laptop", 45000);
        products[2] = new Product(1299, "Television", 34000);
        products[3] = new Product(568, "Projector", 22000);
        products[4] = new Product(3232, "Charger", 1200);

        Util.sort(products);

        for(Product product : products) {
            System.out.println(product);
        }*/

        /*Student [] students = new Student[6];
        students[0] = new Student(45, "Sanika", 74);
        students[1] = new Student(34, "Shreya", 93);
        students[2] = new Student(22, "Neha", 81);
        students[3] = new Student(23, "Mansi", 90);
        students[4] = new Student(10, "Viraj", 78);
        students[5] = new Student(39, "Parth", 82);

        Util.sort(students, new StudentComparator());

        for(Student student : students) {
            System.out.println(student);
        }*/
        System.out.println();

        Product [] products = new Product[5];
        products[0] = new Product(4569, "Smart Phone", 10353);
        products[1] = new Product(2390, "Laptop", 45000);
        products[2] = new Product(1299, "Television", 34000);
        products[3] = new Product(568, "Projector", 22000);
        products[4] = new Product(3232, "Charger", 1200);

        //Util.sort(products, new ProductComparator());
        Util.sort(products, new ProductPriceComparator());
        for(Product product : products) {
            System.out.println(product);
        }

        System.out.println();

        Util.sort(
                products,
                new Comparator() {
                    @Override
                    public int compare(Object obj1, Object obj2) {
                        Product p1 = (Product) obj1;
                        Product p2 = (Product) obj2;
                        if(p1.getId() == p2.getId()) {
                            return 0;
                        }

                        if(p1.getId() > p2.getId()) {
                            return 1;
                        }

                        return -1;
                    }
                }
        );
        for(Product product : products) {
            System.out.println(product);
        }
        System.out.println();


        /*int [] arr = {14, 68, 34, 56, 99, 12, 29, 85};
        Util.sort(arr);

        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();*/
    }
}
