package sorts

object ScalaSorts extends App {
  def quickSort(l:List[Int]): List[Int] = {
     l match {
       case Nil   => Nil
       case x::xs => quickSort(xs.filter(_<= x)) ++ List(x) ++ quickSort(xs.filter(_ > x))
     }
  }
  println(quickSort(List(3, 3, 3, 3)))
}
