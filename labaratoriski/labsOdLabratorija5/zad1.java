
import java.util.*;
public class zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, String[]> map = new HashMap();

        for(int i = 0; i < n; ++i) {
            String name = sc.next();
            String permission=sc.next();
            if(!map.containsKey(name)){
                map.put(name, new String[]{permission});
            } else {
                String[] permissions = map.get(name);
                String[] newPermissions = Arrays.copyOf(permissions, permissions.length + 1);
                newPermissions[newPermissions.length - 1] = permission;
                map.put(name, newPermissions);
            }

        }
        int m = sc.nextInt();
        int [] dozvoleno=new int[m];

        for(int i=0; i<m; i++){
            String name = sc.next();
            String permission1=sc.next();
            String permission2=sc.next();
            String[] permissions=map.get(name);
            boolean flag1=false;
            boolean flag2=false;
            for(int j=0; j<permissions.length; j++){
                if(permissions[j].equals(permission1)){
                    flag1=true;
                }
            }
            for(int j=0; j<permissions.length; j++){
                if(permissions[j].equals(permission2)){
                    flag2=true;
                }
            }
            if(flag1 && flag2){
                dozvoleno[i]=1;
            }else{
                dozvoleno[i]=0;
            }
        }
        for(int i=0; i<dozvoleno.length; i++){
            if(dozvoleno[i]==1){
                System.out.println("GRANTNED");
            }else{
                System.out.println("DENIED");
            }

        }


    }

}