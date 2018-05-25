package ru.terrakok.cicerone.gnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_nes_b.*

/**
 * A simple [Fragment] subclass.
 * Use the [NestedBFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class NestedBFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_nes_b, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        hashTextView.text = hashCode().toString()
        button1.setOnClickListener { view ->
            Navigation.findNavController(view).apply {
                popBackStack()
                popBackStack()
            }
        }
    }
}
