# Домашняя работа по теме «Внедрение системы контроля версий»

## В Классе Main

1. Создается массив sale в котором храниться количество продаж

```java
int[]sale={10,2,3};
```

2. Создается экземпляр объекта SalesManager которому передается массив sale

```java
SalesManager salesMng=new SalesManager(sale);
```

3. Вывод на экран получаемого значения при вызове метода max объекта SalesManager

```java
System.out.println(salesMng.max());
```

## В классе SalesManager

### Метод max

1. В цикле проходит по массиву sale и сохраняет максимальное значение в переменную max
2. Возвращает значение переменной max

```java
public int max(){
        int max=-1;
        for(int sale:sales){
        if(sale>max){
        max=sale;
        }
        }
        return max;
        }
```