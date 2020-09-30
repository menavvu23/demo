public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int m,n;
        int ul,ur,ll,lr;
        boolean res,res1;
        while (cases-->0){
            n = sc.nextInt();
            m = sc.nextInt();
            res = false;
            res1 = true;
            for (int i =0;i<n;i++)
            {
                ul = sc.nextInt();
                ur = sc.nextInt();
                ll = sc.nextInt();
                lr = sc.nextInt();
                if (m %2 != 0)
                {
                    res = false;
                    res1 = false;
                }
                if (ul==lr&&ll==ur){
                   res = true;
                }
            }
            if (res&&res1){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
