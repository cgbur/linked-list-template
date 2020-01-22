import java.util.Collection;

public interface List<T> {
  /**
   * Returns the number of elements in this list.
   *
   * @return the number of elements in the list
   */
  int size();

  /**
   * Returns true if this list contains no elements.
   *
   * @return true if this list contains no elements
   */
  boolean isEmpty();

  /**
   * Removes all of the elements from this list.
   */
  void clear();

  /**
   * Returns true if this list contains the specified element.
   *
   * @param element whose presence in this list is to be tested
   * @return true if this list contains the specified element
   */
  boolean contains(T element);

  /**
   * Returns true if this list contains the specified element.
   *
   * @return an array containing all of the elements in this
   * list in proper sequence
   */
  T[] toArray();

  /**
   * Appends the specified element to the end of this list.
   *
   * @param element to be appended to this list
   */
  void add(T element);

  /**
   * Removes the first occurrence of the specified element
   * from this list, if it is present
   *
   * @param element to be removed from this list, if present
   * @return true if this list contained the specified element
   */
  boolean remove(T element);

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index of the element to return
   * @return the element at the specified position in this list
   */
  T get(int index);

  /**
   * Replaces the element at the specified position in this list
   * with the specified element.
   *
   * @param index   of the element to replace
   * @param element to be stored at the specified position
   * @return the element previously at the specified position
   */
  T set(int index, T element);

  /**
   * Inserts the specified element at the specified position in
   * this list (optional operation). Shifts the element currently
   * at that position (if any) and any subsequent elements to the
   * right (adds one to their indices).
   *
   * @param index   at which the specified element is to be inserted
   * @param element to be inserted
   */
  void add(int index, T element);

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left
   * (subtracts one from their indices).
   *
   * @param index of the element to be removed
   * @return the element previously at the specified position
   */
  T remove(int index);

  /**
   * Removes the first occurrence of the specified element from
   * this list, if it is present.
   *
   * @param element to search for
   * @return the index of the first occurrence of the specified
   * element in this list, or -1 if this list does not contain
   * the element.
   */
  int indexOf(T element);

  /**
   * Returns the index of the first occurrence of the specified
   * element in this list, or -1 if this list does not contain
   * the element.
   *
   * @param element to search for
   * @return the index of the last occurrence of the specified
   * element in this list, or -1 if this list does not contain
   * the element
   */
  int lastIndexOf(T element);

  /**
   * Returns the index of the last occurrence of the specified
   * element in this list, or -1 if this list does not contain the element.
   *
   * @param collection to be checked for containment in this list
   * @return true if this list contains all of the elements
   * of the specified collection
   */
  boolean containsAll(Collection<T> collection);

  /**
   * Appends all of the elements in the specified collection to
   * the end of this list, in the order that they are returned
   * by the specified collection's iterator.
   *
   * @param collection containing elements to be added to this list
   * @return true if this list changed as a result of the call
   */
  boolean addAll(Collection<T> collection);

  /**
   * Inserts all of the elements in the specified collection into
   * this list at the specified position. Shifts the element
   * currently at that position (if any) and any subsequent
   * elements to the right (increases their indices).
   *
   * @param index      at which to insert the first element from the specified collection
   * @param collection containing elements to be added to this list
   * @return true if this list changed as a result of the call
   */
  boolean addAll(int index, Collection<T> collection);

  /**
   * Removes from this list all of its elements that are contained
   * in the specified collection.
   *
   * @param collection containing elements to be removed from this list
   * @return true if this list changed as a result of the call
   */
  boolean removeAll(Collection<T> collection);

  /**
   * Returns a string representation of this list. This will be relied on upon
   * for grading because we cannot walk through your data structure.
   * <p>
   * The format for the string should being a comma-space seperated list
   * of elements wrapped in square brackets.
   *
   * <ul>
   *   <li>list containing nothing: <code>[]</code></li>
   *   <li>list containing a single number one: <code>[1]</code></li>
   *   <li>list containing the numbers 1, 2, 3: <code>[1, 2, 3]</code></li>
   * </ul>
   *
   * @return a String representation of the list formatted as [item1, item2, item3]
   */
  String toString();
}
