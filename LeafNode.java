package CS4320_HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LeafNode extends Node {
	protected ArrayList<String> values;
	protected LeafNode nextLeaf;

	public LeafNode(int firstKey, String firstValue) {
		isLeafNode = true;
		keys = new ArrayList<Integer>();
		values = new ArrayList<String>();
		keys.add(firstKey);
		values.add(firstValue);

	}

	public LeafNode(List<Integer> newKeys, List<String> newValues) {
		isLeafNode = true;
		keys = new ArrayList<Integer>(newKeys);
		values = new ArrayList<String>(newValues);

	}

	/**
	 * insert key/value into this node so that it still remains sorted
	 * 
	 * @param key
	 * @param value
	 */
	public void insertSorted(int key, String value) {
		if (key < keys.get(0)) {
			keys.add(0, key);
			values.add(0, value);
		} else if (key > keys.get(keys.size() - 1)) {
			keys.add(key);
			values.add(value);
		} else {
			ListIterator<Integer> iterator = keys.listIterator();
			while (iterator.hasNext()) {
				if (iterator.next() >= key) {
					int position = iterator.previousIndex();
					keys.add(position, key);
					values.add(position, value);
					break;
				}
			}

		}
	}
	public boolean isOverflowed() {
		return keys.size() > BPlusTree.n;
	}

	public boolean isUnderflowed() {
		return keys.size() < BPlusTree.lD;
	}

}
