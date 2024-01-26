package com.pankaj.avengersassemble.recyclerAdapter

abstract class AbstractModel {
    var adapterPosition: Int = -1
    var onItemClick: RecyclerAdapter.OnItemClick? = null
}
