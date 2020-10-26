package core.utilities

import cats.effect.Sync
import core.model.responses.{PocketArticle, PocketItem}

object pocket {
  def fetchRandomArticles(
      list: List[PocketItem],
      max: Int
  ): List[PocketItem] = {
    import scala.collection.mutable

    val used     = mutable.Set.empty[Int]
    val articles = mutable.ListBuffer.empty[PocketItem]
    val random   = scala.util.Random
    val length   = list.length
    var counter  = 0

    while (counter < max) {
      val i = random.nextInt(length)
      if (!used.contains(i)) {
        used += i
        articles += list(i)
        counter = counter + 1
      }
    }
    articles.toList
  }
}
