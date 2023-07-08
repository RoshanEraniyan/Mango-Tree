import java.util.*;

class Mangotree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int tree_no=sc.nextInt();
        int total_trees=rows*columns;
        int check=0;
        if(tree_no>=1&&tree_no<=columns)
        {
            check=1;
        }
        if(check==0)
        {
            int last_col=columns;
            while(last_col<tree_no)
            {
                last_col+=columns;
            }
            if(last_col==tree_no)
            {
                check=1;
            }
        }
        if(check==0)
        {
            int first_col=1;
            while(first_col<tree_no)
            {
                first_col+=columns;
            }
            if(first_col==tree_no)
            {
                check=1;
            }
            else
            {
                check=0;
            }
        }
        if(check==0)
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}
