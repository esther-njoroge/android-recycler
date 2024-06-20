package com.example.fibonacci

class NumbersRecyclerViewAdapter {var numbers:List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numberView = LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_list_item,parent,false)
        return NumbersViewHolder(numberView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumbers.text = numbers[position].toString()

    }

    override fun getItemCount(): Int {
        return numbers.size
    }

}

    class NumbersViewHolder(numberView:View):RecyclerView.ViewHolder(numberView){
        val tvNumbers = numberView.findViewById<TextView>(R.id.tvNumber)
    }
}

