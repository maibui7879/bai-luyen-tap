public class Main {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Bạn cần nhập hai đối số: width và height.");
            return; 
        }

        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width > 0 && height > 0) {
                int perimeter = 2 * (width + height);
                int area = width * height;

                System.out.println("Chiều rộng: " + width);
                System.out.println("Chiều dài: " + height);
                System.out.println("Chu vi: " + perimeter);
                System.out.println("Diện tích: " + area);
            } else {
                System.out.println("Chiều rộng và chiều cao phải là số nguyên dương.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Đối số không phải là số nguyên hợp lệ. Vui lòng nhập các số nguyên cho chiều rộng và chiều dài.");
        }
    }
}
