package hosseinmirzaei.asanpardakht

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import hosseinmirzaei.asanpardakht.databinding.LayoutReceiptBinding

class ReceiptFragment : Fragment() {

    private lateinit var binding: LayoutReceiptBinding
    private val args: ReceiptFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutReceiptBinding.inflate(
            inflater, container, false
        ).apply {
            lifecycleOwner = viewLifecycleOwner
            moneyAmount = args.moneyAmount
            ownerCardNumber = args.ownerCardNumber
            ownerName = args.ownerName
        }

        return binding.root
    }

}