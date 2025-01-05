class JavaLab1Task3 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try { 
                if (args.length > 2) {
                    throw new Exception("Pass 2 arguments at most.");
               }
                System.out.println("The command line arguments are:");
                String arg1 = args[0];

                
                if (args.length < 2) {
                    throw new Exception("The second argument is missing.");
                }

                
                Integer arg2 = Integer.valueOf(args[1]);

                if (arg2 < 0) {
                    throw new Exception("Negative number");
                }

                
                for (int i = 0; i < arg2; i++) {
                    System.out.println(arg1);
                }
              
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: The second argument must be an integer.");
            } catch (Exception ex) {
                System.out.println("An error occurred: " + ex.getMessage());
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}

