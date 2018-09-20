package sorts

object ScalaSorts extends App {
  def quickSort(l:List[Int]): List[Int] = {
     l match {
       case Nil   => Nil
       case x::xs => quickSort(xs.filter(_<= x)) ++ List(x) ++ quickSort(xs.filter(_ > x))
     }
  }
  def merge(l:List[Int],r:List[Int]):List[Int]={
     (l,r) match {
            case (Nil,Nil)  => l
            case (Nil,ys)   => ys
            case (xs,Nil)   => xs
            case (x::xs,y::ys) => if (x <= y)
                                    x::merge(xs,r)
                                  else
                                    y::merge(l,ys)
          }
 }
  def mergeSort(list:List[Int]): List[Int] = {
    if (list.size <=1) {
      list
    } else {
      val (left,right) = list.splitAt(list.size/2)
      merge(mergeSort(left), mergeSort(right))
    }
  }
  def isSorted(l:List[Int]): Boolean={
    if (l.isEmpty)
      true
    else
      l.zip(l.tail).forall(e=>e._1<=e._2)
  }
  val l0 = List(2,1,30,20,0,-10)
  val l1 = mergeSort(l0)
  println(l1)
  //println(isSorted(List()))
}
