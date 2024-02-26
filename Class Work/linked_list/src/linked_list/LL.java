package linked_list;
public class LL <AnyType>{
    Node head;
    Node tail;

    public LL(){
        head = null;
        tail = null;
    }


	public void addFirst(AnyType data){
		if(head == null){
			Node temp = new Node((data), null);
			head = temp;
			tail = temp;
		}
		else{
			Node temp = new Node(data, head);
			head = temp;
		}
	}

	public void addLast(AnyType data){

		if(head == null){
			addFirst(data);
		}

		else{
			Node temp = new Node(data, null);
			tail.next = temp;
			tail = temp;
		}

	}



	public void printAll(){

		Node temp = head;

		if(head == null){
			System.out.println("List does not exist!...");
			return;
		}

		while(temp != null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public void deleteFirst(){
		if(head == null){
			System.out.println("No List exists");
			return;
		}
		head = head.next;
	}

    public void deleteLast(){
		if(head == null){
			System.out.println("No List exists");
			return;
		}
		Node temp = head;
		Node ptr  = temp.next;
		while(ptr.next != null){
			temp = ptr;
			ptr  = ptr.next;
		}
		temp.next = null;
		tail = temp;
	}

	public void searchData(AnyType data){
		if(head == null){
			System.out.println("No list exists");
			return;
		}
		Node temp = head;
		int i = 1;
		while(temp != null){
			if(temp.data == data){
				System.out.println("Your data is at Node no. " + i);
				return;
			}
			i++;
			temp = temp.next;
		}
		System.out.println("Data did not match in list");
	}

    public int search(AnyType data){
        int counter = -1;
        if(head == null){
            return -1;
        }

        Node temp = head;

        while(temp != null){
            counter ++;
            if(temp.data == data){
				return counter;
            }
            temp = temp.next;
        }
		return -1;
    }

    public void deleteData(AnyType data){
        if(head == null){
            System.out.println("No list exists");
            return;
        }

        if(head.data == data){
            head = head.next;
            System.out.println("Your searched data has been deleted");
			return;
        }
        Node temp = head;
        Node ptr = temp.next;
        while(ptr != null){
            if(ptr.data == data){
                temp.next = ptr.next;
                System.out.println("Your searched data has been deleted");
                return;
            }
            temp = ptr;
            ptr = ptr.next;
        }
        System.out.println("Data not matched!...");
    }                                                           
	
	public void addAt(AnyType data, int index){
		
		Node newNode = new Node(data,null);
		if(index == 0){
			addFirst(data);
			System.out.println("Add succussfully!..");
			printAll();
			return;
		}
	   
		if(head == null){
			System.out.println("No list exists");
			return;
		}
		
		Node temp = head;
		for(int i = 0; temp != null ; temp = temp.next , i++){
			if(i == index-1){
				newNode.next = temp.next;
				temp.next = newNode;
				System.out.println("Added succussfully");
				printAll();
				return;
			}
		}
		System.out.println("Incorrect Index!...");
	}
	
	public void searchDouble(AnyType data1 , AnyType data2){
		if(head == null){
			System.out.println("No list exists!...");
			return;
		}
		
		Node temp = head;
		boolean notFound1 = true , notFound2 = true;
		
		for(int i = 0; temp != null; temp = temp.next , i++){
			if(temp.data == data1){
				System.out.println("Your data: " + data1 + " is at node no. " + i);
			    notFound1 = false;
				}
			else if(temp.data == data2){
				System.out.println("Your data: " + data2 + " is at node no. " + i);
				notFound2 = false;
			}
		}
		if(notFound1 && notFound2){
			System.out.println("We coudn't find your anydata in the list");
		}
		else if(notFound1){
			System.out.println("Your data: " + data1 + " does not exist in the list");
		}
		else if(notFound2){
			System.out.println("Your data: " + data2 + " does not exist in the list");
		}
	}

        public void deleteTwo(AnyType data1, AnyType data2){
            boolean notFound1 = true , notFound2 = true; 
            if(head.data == data1){
                head = head.next;
                System.out.println("Your data \"" + data1 + "\" data has been deleted !...");
                notFound1 = false;
            }
            if(head.data == data2){
            head = head.next;
            System.out.println("Your data \"" + data2 + "\" data has been deleted!...");
            notFound2 = false;
        }
            else{
                Node prev = head;
                Node current = prev.next;
                while(current != null){
                    
                    if(current.data == data1 && notFound1){
                       prev.next = current.next;
                       System.out.println("Your data \"" + data1 + "\" data has been deleted !...");
                       notFound1 = false;
                    }
                   if(current.data == data2 && notFound2){
                       prev.next = current.next;
                       System.out.println("Your data \"" + data2 + "\" data has been deleted !...");
                       notFound2 = false;
                   }
                   prev = current;
                   current = current.next;
                }
                if(notFound1 && notFound2){
                    System.out.println("Sorry we couldn't find your any data in list");
                }
                else if(notFound1){
                    System.out.println("Your data \"" + data1 + "\" didn't exist in the list !...");
                }
                else if(notFound2){
                    System.out.println("Your data \"" + data2 + "\" didn't exist in the list !...");
                }
            }   
        }
        
        
        public void RemoveeNode(AnyType data1 , AnyType data2){ //sir
             int idx [] = {-1,-1};
            if(head == null){
                System.out.println("Linked list empty!...");
            }
            else{
                Node prev = head;
                Node current = prev.next;
                
                if(head.data == data1){
                    head = head.next;
                    System.out.println("1st data has been deleted");
                    idx[0] = 0;
                }
                
                if(head.data == data2){
                    head = head.next;
                    System.out.println("2nd data has been deleted");
                    
                    if(idx[0] == 0)
                        idx[1] = 1;
                    else
                        idx[1] = 0;
                }
                int counter = 0;
                while(current!= null){
                    counter++;
                    if(current.data == data1){
                        current = current.next;
                        prev.next = current;
                     idx[0] = counter;
                     counter++;
                    }
                    
                    if(current.data == data2){
                        current = current.next;
                        prev.next = current;
                     idx[1] = counter;
                    }
                    
                    prev = current;
                    current = current.next;
                }
                
            }
            for (int i : idx) {
                System.out.println("Node " + i);
            }
        }
        
        
    private class Node{
        Node next;
        AnyType data;

        public Node(AnyType data, Node next){
            this.data = data;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to DATA STRUCTURE Code");

        LL <String> list = new LL();
        //LL <Integer> list_1 = new LL<Integer>();

        list.printAll();
        list.addFirst("Zahid");
        list.addLast("Atif");
        list.addFirst("Abhishek");
        list.addFirst("Babar");
        list.addFirst("Jagdeesh");
        list.addFirst("Qasim");

        list.printAll();
        System.out.println("Add Last \n");
        list.addLast("Gautam");
        list.printAll();

		list.deleteFirst();
		list.printAll();

		list.deleteLast();
		list.printAll();

//		list.searchData("Jagdeesh");
//		list.searchData("Yaqoob");


//                System.out.println(list.search("Zahid"));
//                System.out.println(list.search("Qasim"));
//                list.addLast("Qasim");
//                list.printAll();
//                System.out.println(list.search("Qasim"));
//                System.out.println(list.search("Atif"));

		System.out.println("---------");  
		/*list.printAll();
		list.deleteData("Zahid");
		list.printAll();

		System.out.println("");

		list.printAll();
		list.deleteData("Jagdeesh");*/
		list.printAll();
		
//		list.addAt("Sagar",2);
//		list.addAt("Khalil",1);
//		list.addAt("Yousif",0);
//		list.addAt("Babar",10);
//		
//		
//		list.searchDouble("Abhishek","Ram");
//		list.searchDouble("Gautam","Jagdeesh");
//		list.searchDouble("Zahid","Mohsin");
//		list.searchDouble("Sagar","Ahsan");
//		
//		list.deleteTwo("Jagdeesh", "Babarrr");
//		list.printAll();
//                list.deleteTwo("Abhi","Aha");
//                list.printAll();
//                list.deleteTwo("Abhishek","Sagar ");
//                list.printAll();

                  list.RemoveeNode("Abhishek", "Zahid");
                  list.printAll();
                  list.RemoveeNode("Jagdeesh", "Sagar");
                  list.printAll();
                  
                  list.RemoveeNode("Jagdeesh", "Atif");
                  list.printAll();
                  
		 System.out.println("Finished");
    }
}
