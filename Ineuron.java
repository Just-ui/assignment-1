class Ineuron {
    public static void letterI(int size)
    {
        //make size odd if it's even
        if (size % 2 == 0) {
            size += 1;
        }


        for (int row = 0; row <= (size - 1); row++) {
            for (int col = 0; col <= (size - 1); col++) {

                //code executes if row is at first and last index
                if (row == 0 || row == (size - 1)) {
                    System.out.print("*");
                    if (col == (size - 1)) {
                        System.out.println();
                    }

                    //code executes in between first and last row index
                } else {

                    //space generator
                    for (int space = 0; space <= ((size / 2) - 1); space++) {
                        System.out.print(' ');
                    }
                    System.out.print('*');

                    //space generator
                    for (int space = 0; space <= ((size / 2) - 1); space++) {
                        System.out.print(' ');
                    }
                    System.out.println();
                    break;
                }
            }
        }

        System.out.print('\n');
    }

    public static void letterN(int size)
    {
        //make size odd if it's even
        if (size % 2 == 0) {
            size += 1;
        }

        for (int row = 0; row <= (size - 1); row++) {

            //run code block if in between first and last row index
            if (row > 0 && row != (size - 1)) {
                System.out.print('*');

                //space generator
                for (int space = 0; space < (row - 1); space++) {
                    System.out.print(' ');
                }

                System.out.print('*');

                //space generator
                for (int space = 0; space < (size - (row + 2)); space++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                System.out.println();

            //code block executes if row index is first and last
            } else {
                System.out.print('*');
                for (int space = 0; space < (size - 2); space++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                System.out.println();
            }
        }
        System.out.print('\n');
    }

    public static void letterE(int size)
    {
        //make size odd if it's even
        if (size % 2 == 0) {
            size += 1;
        }
        for (int row = 0; row <= (size - 1); row++) {
            System.out.print("*");
            for (int col = 0; col <= (size - 2); col++)
            {
                //code executes if row has the index of first last and middle
                if (row == 0 || row == (size / 2) || row == (size - 1)) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void letterU(int size)
    {
        //make size odd if it's even
        if(size % 2 == 0)
        {
            size += 1;
        }

        for(int row = 0; row <= (size - 1); row++)
        {
            //code executes if row index is not last position
            if(row != (size - 1))
            {
                System.out.print('*');

                //space generator
                for(int space = 0; space <= (size - 3); space++)
                {
                    System.out.print(' ');
                }
                System.out.println('*');
            }

            else
            {
                for(int col = 0; col <= (size - 1); col++)
                {
                    System.out.print('*');
                }
            }
        }
        System.out.print('\n');
        System.out.print('\n');
    }

    public static void letterR(int size)
    {
        //make size odd if it's even
        if(size % 2 == 0)
        {
            size += 1;
        }


        //first half of letter
        for(int row = 0; row <= ((size - 1) / 2); row++)
        {
            if(row == 0 || row == ((size - 1) / 2))
            {
                for(int col = 0; col <= (size - 1); col++)
                {
                    System.out.print('*');
                }
                System.out.println(' ');
            }

            else
            {
                System.out.print('*');

                //space generator
                for(int space = 0; space <= (size - 3); space++)
                {
                    System.out.print(' ');
                }
                System.out.print('*');
                System.out.println();
            }
        }

        //second half of letter
        for(int row = 0; row <= ((size - 1) / 2); row++)
        {
            System.out.print('*');
            for (int space = 0; space <= (row + 1); space++)
                System.out.print(' ');
            System.out.print('*');
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void letterO(int size)
    {
        //make size odd if it's even
        if(size % 2 == 0)
        {
            size += 1;
        }
        for(int row = 0; row <= (size - 1); row++)
        {
            if(row == 0 || row == (size - 1))
            {
                for(int col = 0; col <= (size - 1); col++)
                {
                    System.out.print('*');
                }
                System.out.println(' ');
            }

            else
            {
                System.out.print('*');

                //space generator
                for(int space = 0; space <= (size - 3); space++)
                {
                    System.out.print(' ');
                }
                System.out.print('*');
                System.out.println();
            }
        }
        System.out.print('\n');
    }
}