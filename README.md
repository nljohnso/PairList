PairList
========

PairList acts like an ArrayList, but it will allow the additions of pairs of types which is represented by the Pair<?, ?> class. Since PairList implements java generics no primitive types will be allowed. PairList includes pretty much all ArrayList methods.

Initializing PairList:
======================

```
PairList<?, ?> aPairList = new PairList<>();
```

Adding different types:
=======================
```
  Pair<?, ?> aPair = new Pair<Integer, String>(65546546, "test");
  Pair<?, ?> aPair2 = new Pair<Integer, Double>(655460546, 12.23123124);
  Pair<?, ?> aPair3 = new Pair<Character, Byte>('T', Byte.MAX_VALUE);
  Pair<?, ?> aPair4 = new Pair<String, Double>("another string", 12.23123124);

  aPairList.add(aPair);
  aPairList.add(aPair2);
  aPairList.add(aPair3);
  aPairList.add(aPair4);

  System.out.println(aPairList.toString());
```
OUTPUT: 
```
(65546546 : test), (655460546 : 12.23123124), (T : 127), (another string : 12.23123124)
```
