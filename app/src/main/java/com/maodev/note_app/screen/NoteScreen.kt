package com.maodev.note_app.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maodev.note_app.R
import com.maodev.note_app.components.NoteAddButton
import com.maodev.note_app.components.NoteInputText
import com.maodev.note_app.model.Note

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    notes: List<Note>,
    onAddNote: (Note) -> Unit,
    onRemoveNote: (Note) -> Unit
) {
    var noteTitle by remember {
        mutableStateOf("")
    }
    var noteDescription by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .padding(6.dp)
            .fillMaxSize()
    ) {
        TopAppBar(
            title = {
                Text(
                    text = stringResource(id = R.string.app_name),
                    modifier = Modifier.padding(8.dp)
                )
            },
            actions = {
                Icon(
                    imageVector = Icons.Rounded.Notifications,
                    contentDescription = "Icon",
                    modifier = Modifier.padding(8.dp)
                )
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFDADFE3))
        )

        //CONTENT
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NoteInputText(
                text = noteTitle,
                label = stringResource(id = R.string.label),
                onTextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        })
                        noteTitle = it
                },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            )
            NoteInputText(
                text = noteDescription,
                label = stringResource(id = R.string.description),
                onTextChange = {
                    if (it.all { char ->
                            char.isLetterOrDigit() || char.isWhitespace()
                        })
                        noteDescription = it
                },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            )
            NoteAddButton(
                text = stringResource(id = R.string.addNote).uppercase(),
                onClick = {
                    if (noteTitle.isNotEmpty() && noteDescription.isNotEmpty()) {
                        //TODO SAVE/ADD NOTE
                        noteTitle = ""
                        noteDescription = ""
                    }
                },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    NoteScreen(notes = emptyList(), onAddNote = {}, onRemoveNote = {})
}