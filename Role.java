import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public enum Role
{
	Dougherty("Dougherty", Color.pink, false),
 	Cashman("Cashman", Color.red, false),
 	Sacks("Sacks", Color.blue, false),
 	Wadeworth("Wadeworth", Color.yellow, false),
 	Goldman("Goldman", Color.orange, false),
 	Liebgteld("Liebgteld", Color.green, false);

 	private final String roleName;
 	private final Color color;
 	private boolean owned;

 	//all roles stores into the Role map.
 	private static final Map<String,Role> ROLEmap = new HashMap<String,Role>();

 	static {
		 ROLEmap.put("Dougherty", Role.Dougherty);
		 ROLEmap.put("Cashman", Role.Cashman);
		 ROLEmap.put("Sacks", Role.Sacks);
		 ROLEmap.put("Wadeworth", Role.Wadeworth);
		 ROLEmap.put("Goldman", Role.Goldman);
		 ROLEmap.put("Liebgteld", Role.Liebgteld);
 	}

 	private Role(String roleName, Color color, boolean owned)
 	{
		 this.roleName = roleName;
		 this.color = color;
		 this.owned = owned;
 	}

 	public static void printRole(int i)
 	{
		 switch(i)
		 {
			 case 1: System.out.println(Role.Dougherty);break;
			 case 2: System.out.println(Role.Cashman);break;
			 case 3: System.out.println(Role.Sacks);break;
			 case 4: System.out.println(Role.Wadeworth);break;
			 case 5: System.out.println(Role.Goldman);break;
			 case 6: System.out.println(Role.Liebgteld);break;
				 
			 default:System.out.println("There is no such role!");
		 }

 	}


 	public static void ownedRoles(Role selectedRole)
 	{
		selectedRole.owned = true;
 	}
 	
 	public static void removedRoles(Role selectedRole)
 	{
 		selectedRole.owned = false;
 	}




}
