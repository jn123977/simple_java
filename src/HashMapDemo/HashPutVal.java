package HashMapDemo;

import java.util.HashMap;

public class HashPutVal {
    public static void main(String[] args) {
        HashMap<String,String>  hashMap=new HashMap<>();
        System.out.println(1&1);

    }
    //hashmap中putVal
    /**
     * final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
     *                    boolean evict) {
     *         //声明了一个局部变量 tab,局部变量 Node 类型的数据 p,int 类型 n,i
     *         Node<K,V>[] tab; Node<K,V> p; int n, i;
     *         //首先将当前 hashmap 中的 table(哈希表)赋值给当前的局部变量 tab,然后判断tab 是不是空或者长度是不是 0,实际上就是判断当前 hashmap 中的哈希表是不是空或者长度等于 0
     *         if ((tab = table) == null || (n = tab.length) == 0)
     *         //如果是空的或者长度等于0,代表现在还没哈希表,所以需要创建新的哈希表,默认就是创建了一个长度为 16 的哈希表
     *             n = (tab = resize()).length;
     *         //将当前哈希表中与要插入的数据位置对应的数据取出来,(n - 1) & hash])就是找当前要插入的数据应该在哈希表中的位置,如果没找到,代表哈希表中当前的位置是空的,否则就代表找到数据了, 并赋值给变量 p
     *         if ((p = tab[i = (n - 1) & hash]) == null)
     *             tab[i] = newNode(hash, key, value, null);//创建一个新的数据,这个数据没有下一条,并将数据放到当前这个位置
     *         else {//代表要插入的数据所在的位置是有内容的
     *         //声明了一个节点 e, 一个 key k
     *             Node<K,V> e; K k;
     *             if (p.hash == hash && //如果当前位置上的那个数据的 hash 和我们要插入的 hash 是一样,代表没有放错位置
     *             //如果当前这个数据的 key 和我们要放的 key 是一样的,实际操作应该是就替换值
     *                 ((k = p.key) == key || (key != null && key.equals(k))))
     *                 //将当前的节点赋值给局部变量 e
     *                 e = p;
     *             else if (p instanceof TreeNode)//如果当前节点的 key 和要插入的 key 不一样,然后要判断当前节点是不是一个红黑色类型的节点
     *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);//如果是就创建一个新的树节点,并把数据放进去
     *             else {
     *                 //如果不是树节点,代表当前是一个链表,那么就遍历链表
     *                 for (int binCount = 0; ; ++binCount) {
     *                     if ((e = p.next) == null) {//如果当前节点的下一个是空的,就代表没有后面的数据了
     *                         p.next = newNode(hash, key, value, null);//创建一个新的节点数据并放到当前遍历的节点的后面
     *                         if (binCount >= TREEIFY_THRESHOLD - 1) // 重新计算当前链表的长度是不是超出了限制
     *                             treeifyBin(tab, hash);//超出了之后就将当前链表转换为树,注意转换树的时候,如果当前数组的长度小于MIN_TREEIFY_CAPACITY(默认 64),会触发扩容,我个人感觉可能是因为觉得一个节点下面的数据都超过8 了,说明 hash寻址重复的厉害(比如数组长度为 16 ,hash 值刚好是 0或者 16 的倍数,导致都去同一个位置),需要重新扩容重新 hash
     *                         break;
     *                     }
     *                     //如果当前遍历到的数据和要插入的数据的 key 是一样,和上面之前的一样,赋值给变量 e,下面替换内容
     *                     if (e.hash == hash &&
     *                         ((k = e.key) == key || (key != null && key.equals(k))))
     *                         break;
     *                     p = e;
     *                 }
     *             }
     *             if (e != null) { //如果当前的节点不等于空,
     *                 V oldValue = e.value;//将当前节点的值赋值给 oldvalue
     *                 if (!onlyIfAbsent || oldValue == null)
     *                     e.value = value; //将当前要插入的 value 替换当前的节点里面值
     *                 afterNodeAccess(e);
     *                 return oldValue;
     *             }
     *         }
     *         ++modCount;//增加长度
     *         if (++size > threshold)
     *             resize();//如果当前的 hash表的长度已经超过了当前 hash 需要扩容的长度, 重新扩容,条件是 haspmap 中存放的数据超过了临界值(经过测试),而不是数组中被使用的下标
     *         afterNodeInsertion(evict);
     *         return null;
     *     }
     */
}
