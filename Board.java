import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Board{

	private final static int numberOfPosition = 16;
	private Deal deal;
	public static Map<Integer,Deal> board_info;
	
	private ArrayList<Role> requireList;
	private ArrayList<Role> optionalList;
	private ArrayList<Role> optionalList_2;
	
	
		
	public Board() 
	{
		board_info = new HashMap<Integer,Deal>(numberOfPosition);
		this.collectInfo();
	}	

	private void refreshLists() 
	{
		this.requireList = new ArrayList<Role>();
		this.optionalList = new ArrayList<Role>();
		this.optionalList_2 = new ArrayList<Role>();
	}
	
	private void addNewDeal(int position,int num_role,int num_share, ArrayList<Role> requireList, ArrayList<Role> optionalList, ArrayList<Role> optionalList_2) 
	{
		num_role = new Integer(num_role);
		num_share = new Integer(num_share);
		
		deal = new Deal(position,num_role,num_share);
		deal.add_requireList(requireList); 
		deal.add_optionalList(optionalList);
		deal.add_optionalList_2(optionalList_2);
		deal.generate_traderInfoList();
		
		board_info.put(position, deal);
	}
	
	// this method will collect informations from every deal and store into the board_info map.
	private boolean collectInfo()
	{
		boolean collectFinished = false;
		//deal0
		this.refreshLists();
		this.requireList.add(Role.Cashman);
		this.requireList.add(Role.Sacks);
		this.requireList.add(Role.Wadeworth);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Goldman);
		this.optionalList.add(Role.Liebgteld);
		this.addNewDeal(0, 5, 6, requireList, optionalList, optionalList_2);
		
		//deal1
		this.refreshLists();
		this.optionalList.add(Role.Goldman);
		this.optionalList.add(Role.Sacks);
		this.optionalList.add(Role.Wadeworth);
		this.optionalList_2.add(Role.Dougherty);
		this.optionalList_2.add(Role.Liebgteld);
		this.addNewDeal(1, 3, 4, requireList, optionalList, optionalList_2);
		
		//deal2
		this.refreshLists();
		this.optionalList.add(Role.Cashman);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Goldman);
		this.optionalList.add(Role.Liebgteld);
		this.optionalList.add(Role.Wadeworth);
		this.addNewDeal(2, 4, 5, requireList, optionalList, optionalList_2);
		
		//deal3
		this.refreshLists();
		this.requireList.add(Role.Cashman);
		this.requireList.add(Role.Goldman);
		this.addNewDeal(3, 2, 3, requireList, optionalList, optionalList_2);
		
		//deal4
		this.refreshLists();
		this.optionalList.add(Role.Cashman);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Goldman);
		this.optionalList.add(Role.Liebgteld);
		this.optionalList.add(Role.Sacks);
		this.optionalList.add(Role.Wadeworth);
		this.addNewDeal(4, 5, 6, requireList, optionalList, optionalList_2);
		
		//deal5
		this.refreshLists();
		this.requireList.add(Role.Liebgteld);
		this.requireList.add(Role.Wadeworth);
		this.addNewDeal(5, 2, 3, requireList, optionalList, optionalList_2);
		
		//deal6
		//different from actual board game(real game is:2/2/2).
		this.refreshLists();
		this.requireList.add(Role.Goldman);
		this.requireList.add(Role.Liebgteld);
		this.requireList.add(Role.Cashman);
		this.requireList.add(Role.Dougherty);
		this.requireList.add(Role.Sacks);
		this.requireList.add(Role.Wadeworth);
		this.addNewDeal(6, 6, 7, requireList, optionalList, optionalList_2);
		
		//deal7
		this.refreshLists();
		this.requireList.add(Role.Dougherty);
		this.requireList.add(Role.Liebgteld);
		this.optionalList.add(Role.Sacks);
		this.optionalList.add(Role.Wadeworth);
		this.addNewDeal(7, 3, 4, requireList, optionalList, optionalList_2);
		
		//deal8
		this.refreshLists();
		this.requireList.add(Role.Dougherty);
		this.requireList.add(Role.Goldman);
		this.requireList.add(Role.Liebgteld);
		this.optionalList.add(Role.Cashman);
		this.optionalList.add(Role.Sacks);
		this.optionalList.add(Role.Wadeworth);	
		this.addNewDeal(8, 5, 6, requireList, optionalList, optionalList_2);
		
		//deal9
		this.refreshLists();
		this.optionalList.add(Role.Cashman);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Liebgteld);
		this.optionalList_2.add(Role.Goldman);
		this.optionalList_2.add(Role.Sacks);
		this.optionalList_2.add(Role.Wadeworth);
		this.addNewDeal(9, 4, 6, requireList, optionalList, optionalList_2);
		
		//deal10
		this.refreshLists();
		this.requireList.add(Role.Sacks);
		this.requireList.add(Role.Cashman);
		this.requireList.add(Role.Goldman);
		this.addNewDeal(10, 3, 4, requireList, optionalList, optionalList_2);
		
		//deal11
		this.refreshLists();
		this.optionalList.add(Role.Cashman);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Goldman);
		this.optionalList.add(Role.Liebgteld);
		this.optionalList.add(Role.Sacks);
		this.optionalList.add(Role.Wadeworth);
		this.addNewDeal(11, 4, 5, requireList, optionalList, optionalList_2);
		
		//deal12
		this.refreshLists();
		this.requireList.add(Role.Cashman);
		this.requireList.add(Role.Wadeworth);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Goldman);
		this.optionalList.add(Role.Liebgteld);
		this.optionalList.add(Role.Sacks);
		this.addNewDeal(12, 5, 6, requireList, optionalList, optionalList_2);

		//deal13
		this.refreshLists();
		this.optionalList.add(Role.Cashman);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Goldman);
		this.optionalList.add(Role.Wadeworth);
		this.addNewDeal(13, 3, 4, requireList, optionalList, optionalList_2);
		
		//deal14
		this.refreshLists();
		this.requireList.add(Role.Dougherty);
		this.requireList.add(Role.Goldman);
		this.addNewDeal(14, 2, 3, requireList, optionalList, optionalList_2);
	
		//deal15
		this.refreshLists();
		this.requireList.add(Role.Wadeworth);
		this.optionalList.add(Role.Dougherty);
		this.optionalList.add(Role.Liebgteld);
		this.optionalList_2.add(Role.Cashman);
		this.optionalList_2.add(Role.Sacks);
		this.addNewDeal(15, 3, 4, requireList, optionalList, optionalList_2);
		
		return collectFinished;
	}






    public static void main(String[] args) 
    {
    	Board board = new Board();
    	System.out.println("Board.board_info.isEmpty(): " + Board.board_info.isEmpty());
    	for(int i = 0; i < Board.board_info.size(); i++)
    	{
    		System.out.println(Board.board_info.get(i).toString()); 
    	}

    	
    }
}
