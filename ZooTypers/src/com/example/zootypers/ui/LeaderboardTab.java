package com.example.zootypers.ui;


import com.example.zootypers.core.ScoreEntry;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Represents a Tab in the leaderboard layout
 * @author ZooTypers
 *
 */
public class LeaderboardTab extends Fragment {

	
	/**
	 * create a new view for the fragment
	 * 
	 */
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (container == null) {
			return null;
		}
		return container;
	}
	
	/**
	 * sets up the leaderboard list using the given array of entries
	 * @param view the leaderboard view
	 * @param seArray the list of entries to put in the leaderboard
	 */
	protected void setupLBList(View view, ScoreEntry[] seArray) {
		for (int i = 0; i < seArray.length; i++) {
			// get the text boxes with for the leaderboard
			TextView currentFriendText = (TextView) getByStringId(view, 
					"player_name" + i);
			TextView currentScoreText = (TextView) getByStringId(view,
					"player_score" + i);
			
			// get the entries from the ScoreEntry
			ScoreEntry currentSE = seArray[i];
			String currentFriend = currentSE.getName();
			String currentScore = currentSE.getScore() + "";
			
			// set the text fields
			currentFriendText.setText(currentFriend);
			currentScoreText.setText(currentScore);
		}
	}
	
	/**
	 * @param id The id of the View to get as a String.
	 * @return The View object with that id
	 */
	private final View getByStringId(View view, final String id) {
		return view.findViewById(getResources().getIdentifier(id, "id", getActivity().getPackageName()));
	}
}