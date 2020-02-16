if [ "$TRAVIS_BRANCH" != "slave" ]; then
  exit 0
fi

export GIT_COMMITTER_EMAIL="s.ayeshaalam@gmail.com"
export GIT_COMMITTER_NAME="ayeshaalam"

git checkout master || exit
git merge "$TRAVIS_COMMIT" || exit
git push "https://github.com/ayeshaalam/application1.git" master