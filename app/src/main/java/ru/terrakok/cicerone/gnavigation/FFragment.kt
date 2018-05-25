package ru.terrakok.cicerone.gnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_f.*

/**
 * A simple [Fragment] subclass.
 * Use the [FFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_f, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        hashTextView.text = hashCode().toString()
        button1.setOnClickListener { view ->
            Navigation.findNavController(view).navigate(R.id.action_FFragment_to_navigation)
        }

        button2.setOnClickListener { view ->
            Navigation.findNavController(view).navigate(R.id.action_FFragment_self)
        }
    }
}
