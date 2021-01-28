package com.kh.c_collection.a_list.simple;

import java.util.Iterator;

import com.kh.c_collection.a_list.simple.node.Node;

public class SimpleLinkedList<E> implements Iterable<E>{

	private Node<E> head;		//첫 노드를 저장
	private Node<E> moveLink;	//노드 간 이동용 레퍼런스
	private int nodeCount;		//노드의 개수
	
	public SimpleLinkedList() {
		super();
	}
	
	//size
	public int size() {
		return nodeCount;
	}
	
	//add
	public void add(E data) {
		//node를 생성해 사용자가 입력한 데이터를 넘겨준다.
		Node<E> node = new Node<E>(data);
		
		//첫번째 노드라면
		if(head == null && nodeCount == 0) {
			head = node;
		} else {
			moveLink = head;
			//현재 노드들 중에서 가장 마지막 노드를 탐색하는 반복문
			//마지막 노드는 link에 아무런 값도 들어있지 않다.
			for(int i = 0; i < nodeCount-1; i++) {
				//moveLink에 moveLink에 담겨있던 노드의 다음 노드를 저장
				//getLink() : 다음 노드
				moveLink = moveLink.getLink();
			}
			//마지막 노드의 link에 새 노드의 주소를 저장
			moveLink.setLink(node);
		}
		nodeCount++;
	}
	
	//get
	public E get(int index) {
		moveLink = head;
		for(int i = 0; i < index; i++) {
			moveLink = moveLink.getLink();
		}
		
		return moveLink.getData();
	}
	
	//set
	public E set(int index, E data) {
		E res = null;
		moveLink = head;
		
		for(int i = 0; i < index; i++ ) {
			moveLink = moveLink.getLink();
		}
		
		res = moveLink.getData();
		moveLink.setData(data);
		return res;
	}
	
	//remove
	public E remove(int index) {
		E res = null;
		moveLink = head;
		
		if(index == 0) {
			//삭제 될 데이터를 미리 res에 저장
			res = head.getData();
			//head에 두번째 노드를 저장
			head = head.getLink();
		} else {
			//삭제해야하는 노드의 앞 노드를 탐색하는 코드
			for(int i = 0; i < index-1; i++) {
				moveLink = moveLink.getLink();
			}
			//삭제될 데이터를 미리 res에 저장
			//moveLink는 삭제할 데이터의 앞 노드. moveLink의 다음 노드의 데이터를 res에 저장
			res = moveLink.getLink().getData();
			//moveLink의 다다음 노드를 moveLink의 link에 저장
			//이렇게 되면 moveLink의 다음 노드인 삭제 대상 노드는 더이상 그 노드를 참조하는 레퍼런스가 없게 되며
			//가비지컬렉터에 의해 메모리에서 삭제하게 된다.
			moveLink.setLink(moveLink.getLink().getLink());
		}
		nodeCount--;
		return res;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			private int iterIdx;

			//Iterator가 읽은 데이터의 개수와 
			//list 안의 데이터 개수를 비교해 true/false 반환
			
			@Override
			public boolean hasNext() {
				if(iterIdx < nodeCount) {
					return true;
				}
				return false;
//				System.out.println("hasNext메서드 호출");
//				moveLink = head;
//				
//				if(iterIdx == 0) {
//					if(moveLink.getData() == null) {
//						return false;
//					}
//				} else {
//					for(int i = 0; i < iterIdx-1; i++) {
//						moveLink = moveLink.getLink();
//					}
//					if(moveLink.getLink() == null) {
//						return false;
//					}
//				}
//				return true;
			}

			@Override
			public E next() {
//				System.out.println("next메서드 호출");
				//get메서드를 활용해 iterIdx 다음 노드의 데이터를 반환
				E res = get(iterIdx);
				//데이터를 하나 더 반환 했음으로 iterIdx를 1 증가
				iterIdx++;
				return res;
			}
		};
	}
}
