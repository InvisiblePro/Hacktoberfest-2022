int numMatchingSubseq (string S, vector<string>& words) {
		vector<vector<int>> alpha (26);
		for (int i = 0; i < S.size (); ++i) alpha[S[i] - 'a'].push_back (i);
		int res = 0;

		for (const auto& word : words) {
			int x = -1;
			bool found = true;

			for (char c : word) {
				auto it = upper_bound (alpha[c - 'a'].begin (), alpha[c - 'a'].end (), x);
				if (it == alpha[c - 'a'].end ()) found = false;
				else x = *it;
			}

			if (found) res++;
		}

		return res;
	}