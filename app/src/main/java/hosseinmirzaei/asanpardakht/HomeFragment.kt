package hosseinmirzaei.asanpardakht

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import hosseinmirzaei.asanpardakht.databinding.LayoutHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: LayoutHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutHomeBinding.inflate(
            inflater, container, false
        ).apply {
            lifecycleOwner = viewLifecycleOwner
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.createReceipt.setOnClickListener {

            val moneyAmount = binding.etPrice.text.toString()
            val ownerName = binding.etName.text.toString()
            val ownerCardNumber = binding.etCard.text.toString()

            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToReceiptFragment(
                    moneyAmount = moneyAmount,
                    ownerName = ownerName,
                    ownerCardNumber = ownerCardNumber
                )
            )
        }
    }
}