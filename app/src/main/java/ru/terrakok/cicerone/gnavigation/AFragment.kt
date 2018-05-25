package ru.terrakok.cicerone.gnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_a.*

/**
 * A simple [Fragment] subclass.
 * Use the [AFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class AFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_a, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        hashTextView.text = hashCode().toString()
        button1.setOnClickListener { view ->
            Navigation.findNavController(view).navigate(R.id.action_AFragment_to_BFragment)
// java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState
//            Thread {
//                Thread.sleep(1500)
//                Handler(Looper.getMainLooper()).post {
//                    Navigation.findNavController(view).navigate(R.id.action_AFragment_to_BFragment)
//                }
//            }.start()
        }
        button2.setOnClickListener { view ->
            Navigation.findNavController(view).navigate(R.id.action_AFragment_to_navigation)
        }
    }
}
