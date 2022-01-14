# Git Commands

## Configuring Tooling
> `git config --global user.name "[name]"`

This sets the name you want attached to commit transactions.

> `git config --global user.email "[email]"`

This sets the name you want attached to commit transactions. 

## Creating Repositories
> `git init [project-name]`

This creates a new local repository with the specified name

> `git clone [url]`

This downloads a project and its entire version history

## Making Changes
> `git status`

This lists all new or modified files to be committed.

> `git diff`

This shows file differences not yet staged. 

> `git add [file]`

This snapshots the file in preparation for versioning.

> `git diff -staged`

This shows file differences between staging and last file version.

> `git commit -m "[descriptive message]"`

This records the file snapshots permanently in the version history.

## Group Changes
> `git branch`

This lists all local branches in the current repository

> `git branch [branch-name]`

This creates a new branch

> `git checkout [branch-name]`

This switches to the specified branch and updates the working directory.

> `git merge [branch]`

This combines the specified branch's history into the current branch

> `git branch -d [branch-name] `

This deletes the specified branch

> `git remote add [remote-name] [url]`

This adds a new remote git repository as a shortname

> `git remote -v`

This lists all remote git repositories

## Synchronize Changes

> `git fetch [bookmark] [branch]`

This downloads all history from the repo bookmark, optionally specifying branch.

> `git merge [bookmark]/[branch]`

This combines bookmark's branch into current local branches

> `git push [alias] [branch]`

This uploads all local branch commits to GitHub

> `git push [alias] :[branch]`

This deletes remote branch 

> `git pull`

This downloads bookmark history and incorporates changes

> `git revert -n <sha>`

This reverts a commit

## Redo Commits
> `git reset [commit]`

This undoes all commits after [commit], preserving changes locally.

> `git reset --hard [commit]`

This discards all history and changes back to the specified commit

## Review History
> `git log`

this lists version history for the current branch.
