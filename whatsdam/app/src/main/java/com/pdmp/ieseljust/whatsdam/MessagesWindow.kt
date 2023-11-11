package com.pdmp.ieseljust.whatsdam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.pdmp.ieseljust.whatsdam.databinding.ActivityMainBinding
import com.pdmp.ieseljust.whatsdam.databinding.ActivityMessagesWindowBinding

class MessagesWindow : AppCompatActivity() {

    //volvemos a usar View Binding
    private lateinit var binding: ActivityMessagesWindowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessagesWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recuperamos los valores del intent
        val nickNameText = intent.getStringExtra("nickNameText")
        val serverAddressText = intent.getStringExtra("serverAddressText")

        //enlazamos con el textview que hemos definido
        val connectionInfoTextView : TextView = findViewById(R.id.connectionInfoTextView)

        //Configuramos mensaje
        connectionInfoTextView.text = "Conectado a $serverAddressText como $nickNameText"

    //Construcció RecyclerView
        //Establim el LayoutManager per al RecycleView

        binding.MissatgesRecyclerView.layoutManager= LinearLayoutManager(this)

        //Indiquem grandària fixa
        binding.MissatgesRecyclerView.setHasFixedSize(true)

        //Afegim adaptador

        binding.MissatgesRecyclerView.adapter = AdaptadorMissatges()

        //COnfiguramos el callback para borrar el texto al presionar enviar
        //Adaptació: que no soles esborre sinò assigne el missatge

        binding.sendMessage.setOnClickListener{

            //Obtencio del missatge del edittext. Ojo que el edittext retorna editable, no String
            val missatge : String = binding.MessageText.text.toString()

            //Obtenció del usuari
                //TODO

            //Afegim a la llista. Nickname text será no null perque ve del no null de la MainActivity
            Missatges.add(nickNameText!!,missatge) //A adaptar amb el altre usuari

            //Avisem al adaptador

            binding.MissatgesRecyclerView.adapter?.notifyItemInserted(Missatges.missatges.size - 1)

            //Smooth scroll a l'ultim element

            val index = Missatges.missatges.size - 1  //el index será el ultim element (ojo es una llista, comença per 0)

            binding.MissatgesRecyclerView.smoothScrollToPosition(index)

            //Netejem missatge
            binding.MessageText.text.clear()



        }


    }
}