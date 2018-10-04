# Class Example - 4 Oct

Create an application to get a person's favourite animal. 

After a user enters the name of their favourite animal, its age, and 
display the animal to the user.


If the animal is an odd number of years old, print out 
"[Animal name] will be an even age next year. "

Otherwise print out 
"[Animal name] is odd". 

Ask the user if they want to enter another animal. 

Do this until the user says "no" or "nO" or "NO"
============================================================

#Git commands for pushing this repository are below 

Microsoft Windows [Version 10.0.15063]
C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>dir
 Volume in drive C has no label.
 Volume Serial Number is B2FB-F440

 Directory of C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct

10/04/2018  03:40 PM    <DIR>          .
10/04/2018  03:40 PM    <DIR>          ..
10/04/2018  04:36 PM    <DIR>          .idea
10/04/2018  02:48 PM               437 ClassSample4Oct.iml
10/04/2018  03:40 PM    <DIR>          out
10/04/2018  02:48 PM    <DIR>          src
               1 File(s)            437 bytes
               5 Dir(s)  101,096,845,312 bytes free

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git init
Initialized empty Git repository in C:/Users/GBTC440001ur/IdeaProjects/ClassSample4Oct/.git/

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git add .

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   .idea/description.html
        new file:   .idea/misc.xml
        new file:   .idea/modules.xml
        new file:   .idea/project-template.xml
        new file:   .idea/workspace.xml
        new file:   ClassSample4Oct.iml
        new file:   out/production/ClassSample4Oct/com/company/Main.class
        new file:   out/production/ClassSample4Oct/com/company/readme.md
        new file:   src/com/company/Main.java
        new file:   src/com/company/readme.md


C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git commit -m "From class exercise on favourite animal"
[master (root-commit) b0595de] From class exercise on favourite animal
 10 files changed, 349 insertions(+)
 create mode 100644 .idea/description.html
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/project-template.xml
 create mode 100644 .idea/workspace.xml
 create mode 100644 ClassSample4Oct.iml
 create mode 100644 out/production/ClassSample4Oct/com/company/Main.class
 create mode 100644 out/production/ClassSample4Oct/com/company/readme.md
 create mode 100644 src/com/company/Main.java
 create mode 100644 src/com/company/readme.md

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git remote -v

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git remote add origin https://github.com/aoa4eva/FavouriteAnimalLoop

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   .idea/workspace.xml

no changes added to commit (use "git add" and/or "git commit -a")

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git remote -v
origin  https://github.com/aoa4eva/FavouriteAnimalLoop (fetch)
origin  https://github.com/aoa4eva/FavouriteAnimalLoop (push)

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   .idea/workspace.xml

no changes added to commit (use "git add" and/or "git commit -a")

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git rm .idea/workspace.xml
error: the following file has local modifications:
    .idea/workspace.xml
(use --cached to keep the file, or -f to force removal)

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git rm .idea/workspace.xml -f
rm '.idea/workspace.xml'

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git status
On branch master
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        deleted:    .idea/workspace.xml


C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git add .

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git commit -m "Removed worskpace.xml"
[master 30bc984] Removed worskpace.xml
 1 file changed, 244 deletions(-)
 delete mode 100644 .idea/workspace.xml

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git push -u origin master
fatal: HttpRequestException encountered.
   An error occurred while sending the request.
Username for 'https://github.com': aoa4eva
Password for 'https://aoa4eva@github.com':
Counting objects: 23, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (17/17), done.
Writing objects: 100% (23/23), 6.16 KiB | 485.00 KiB/s, done.
Total 23 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), done.
remote:
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/aoa4eva/FavouriteAnimalLoop/pull/new/master
remote:
To https://github.com/aoa4eva/FavouriteAnimalLoop
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git remote add anotherrepo https://github.com/JBCSep2018/FavouriteAnimalLoop.git

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git remote -v
anotherrepo     https://github.com/JBCSep2018/FavouriteAnimalLoop.git (fetch)
anotherrepo     https://github.com/JBCSep2018/FavouriteAnimalLoop.git (push)
origin  https://github.com/aoa4eva/FavouriteAnimalLoop (fetch)
origin  https://github.com/aoa4eva/FavouriteAnimalLoop (push)

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git status
On branch master
Your branch is up-to-date with 'origin/master'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/vcs.xml
        .idea/workspace.xml

nothing added to commit but untracked files present (use "git add" to track)

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git add .
warning: LF will be replaced by CRLF in .idea/vcs.xml.
The file will have its original line endings in your working directory.

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git commit -m "Added a remote"
[master a7c2402] Added a remote
 2 files changed, 261 insertions(+)
 create mode 100644 .idea/vcs.xml
 create mode 100644 .idea/workspace.xml

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git push -ur anotherrepo master
error: unknown switch `r'
usage: git push [<options>] [<repository> [<refspec>...]]

    -v, --verbose         be more verbose
    -q, --quiet           be more quiet
    --repo <repository>   repository
    --all                 push all refs
    --mirror              mirror all refs
    -d, --delete          delete refs
    --tags                push tags (can't be used with --all or --mirror)
    -n, --dry-run         dry run
    --porcelain           machine-readable output
    -f, --force           force updates
    --force-with-lease[=<refname>:<expect>]
                          require old value of ref to be at this value
    --recurse-submodules[=<check|on-demand|no>]
                          control recursive pushing of submodules
    --thin                use thin pack
    --receive-pack <receive-pack>
                          receive pack program
    --exec <receive-pack>
                          receive pack program
    -u, --set-upstream    set upstream for git pull/status
    --progress            force progress reporting
    --prune               prune locally removed refs
    --no-verify           bypass pre-push hook
    --follow-tags         push missing but relevant tags
    --signed[=<yes|no|if-asked>]
                          GPG sign the push
    --atomic              request atomic transaction on remote side
    -o, --push-option <server-specific>
                          option to transmit
    -4, --ipv4            use IPv4 addresses only
    -6, --ipv6            use IPv6 addresses only


C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>git push -u anotherrepo master
fatal: HttpRequestException encountered.
   An error occurred while sending the request.
Username for 'https://github.com': aoa4eva
Password for 'https://aoa4eva@github.com':
Counting objects: 28, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (22/22), done.
Writing objects: 100% (28/28), 7.64 KiB | 782.00 KiB/s, done.
Total 28 (delta 3), reused 0 (delta 0)
remote: Resolving deltas: 100% (3/3), done.
remote:
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/JBCSep2018/FavouriteAnimalLoop/pull/new/master
remote:
To https://github.com/JBCSep2018/FavouriteAnimalLoop.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from anotherrepo.

C:\Users\GBTC440001ur\IdeaProjects\ClassSample4Oct>
