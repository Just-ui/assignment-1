class Telusko
{

    public static void letterT(int size)
    {
        //make size odd if it's even
        if(size % 2 == 0)
        {
            size += 1;
        }

        for(int row = 0; row <= (size - 1); row++)
        {
            for(int col = 0; col <= (size - 1); col++)
            {
                if(row == 0)
                {
                    System.out.print("*");
                    if(col == (size - 1))
                    {
                        System.out.println();
                    }
                }

                //code block executes if row index is 1 or higher
                else {
                    //space generator
                    for(int space = 0; space <= ((size / 2) - 1); space++)
                    {
                        System.out.print(' ');
                    }
                    System.out.print('*');
                    for(int space = 0; space <= ((size / 2) - 1); space++)
                    {
                        System.out.print(' ');
                    }
                    System.out.println();
                    break;
                }
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

    public static void letterL(int size)
    {
        //make size odd if it's even
        if(size % 2 == 0)
        {
            size += 1;
        }
        for(int row = 0; row <= (size - 1); row++)
        {
            System.out.println("*");

            //code block executes at 2nd to the last index
            if(row == (size - 2))
            {
                for(int col = 0; col <= (size - 2); col++)
                    System.out.print('*');
            }
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

    public static void letterS(int size)
    {
        //make size odd if it's even
        if(size % 2 == 0)
        {
            size += 1;
        }


        for(int row = 0; row <= (size - 1); row++)
        {
            for(int col = 0; col <= (size - 1); col++)
            {
                //code block executes at row first middle and last index
                if(row == 0 || row == (size / 2) || row == (size - 1))
                {
                    System.out.print("*");
                }

                else
                {
                    //code block executes at first half of row index
                    if(row > (size / 2))
                    {
                        for(int space = 0; space <= (size - 2); space++)
                        {
                            System.out.print(' ');
                        }
                        System.out.print('*');
                    }

                    //code block executes at second half of row index
                    else
                    {
                        System.out.print('*');
                    }
                    break;
                }
            }
            System.out.println();
        }
        System.out.print('\n');
    }

    public static void letterK(int size)

    {
        //make size odd if it's even
        if(size % 2 == 0)
        {
            size += 1;
        }

        for(int row = 0; row <= (size - 1); row++)
        {
            if(row < (size / 2))
            {
                System.out.print("*");

                //space generator
                for (int space = 0; space <= ((size - 3) - (row * 2)); space++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            //code block executes at second half of row index
            if(row > (size / 2))
            {

                System.out.print('*');

                for(int space = 0; space <= -((size + 1) - (row * 2)); space++)
                {
                    System.out.print(' ');
                }

                System.out.print('*');
                System.out.println();

            }
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
            //code block executes at first and last index of row
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