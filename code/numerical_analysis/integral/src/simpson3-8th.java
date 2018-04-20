      import java.util.Scanner;
            
            public class simpson3-8th {
            
                public static void main(String[] args) {
            
                    Scanner scan = new Scanner(System.in);
                    float y, a, b, n, h, fa, fb, y0, sum1, sum2, fx;
                    
                    System.out.println(" enter the number of partitions ");
                    n = scan.nextFloat();
                    System.out.println(" enter the value of the limits for definite integral ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    
                    h = (b-a) / n;
                    fa = (a * a) + a;
                    fb = (b * b) + b;
                    y0 = a;
                    sum1 = 0;
                    sum2 = 0;
                    for(int i = 1; i < n-1; ++i) {
                          
                          y = y0 + (i * h);
                          fx = (y * y) + y;
                          
                          if(i % 3 == 0)
                              sum1 += fx;
                          else
                              sum2 += fx;
                    }
                    float totsum = (3 * h / 8) * (fa + fb + (3*sum2) + (2*sum1));
                    System.out.println(totsum);
                }
            }
