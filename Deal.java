import java.util.ArrayList;

/*
 * Deal.class is contained a hash map in Board class
 * 
 */

public class Deal
{
		private ArrayList<Role> trader_RequireList = new ArrayList<Role>(5);
		private ArrayList<Role> trader_OptionList = new ArrayList<Role>(5);
		private ArrayList<Role> trader_OptionList_2 = new ArrayList<Role>(5);
		private ArrayList<ArrayList<Role>> traderInfoList = new ArrayList<ArrayList<Role>>(3);
		
		private int position;
		private int int_Roles;
		private int int_Shares;

		public Deal(int position, int int_Roles, int int_Shares)
		{
			this.position = position;
			this.int_Roles = int_Roles;
			this.int_Shares = int_Shares;
		}

		////////////////////////////adding elements and generating final dealInfoList////////////////////
		public void add_requireList(ArrayList<Role> input_roleList)
		{
			this.trader_RequireList.addAll(0,input_roleList);
		}

		public void add_optionalList(ArrayList<Role> input_roleList)
		{
			this.trader_OptionList.addAll(0,input_roleList);
		}

		public void add_optionalList_2(ArrayList<Role> input_roleList)
		{
			this.trader_OptionList_2.addAll(0,input_roleList);
		}
		
		public boolean generate_traderInfoList()
		{
			boolean generationFinished = false;
				this.traderInfoList.add(this.trader_RequireList);
				this.traderInfoList.add(this.trader_OptionList);
				this.traderInfoList.add(this.trader_OptionList_2);
				if(this.traderInfoList.size() == 3)
				{
					generationFinished = true;
				}
			return generationFinished;
		}
		
		//////////////////////////getters//////////////////////////
		public int getNumOfRoles() 
		{
			return int_Roles;
		}
		public int getNumOfShares()
		{
			return int_Shares;
		}
		
		
		public String toString() 
		{
			String outprint = new String();
			outprint = "deal" + position + ":\n"
					   + "#of Roles :"+ int_Roles+ "\n"
					   + "#of Shares: "+ int_Shares+ "\n"
					   + "required traders: "+ this.trader_RequireList.toString()+"\n"
					   + "optional traders: "+ this.trader_OptionList.toString()+"\n"
					   + "optional traders: "+ this.trader_OptionList_2.toString()+"\n";
					   
			return outprint;
		}
}
