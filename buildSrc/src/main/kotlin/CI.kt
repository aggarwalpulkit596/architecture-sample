object CI {
    fun canAutoUpload(): Boolean {
        return !System.getenv("SENTRY_AUTH_TOKEN").isNullOrEmpty()
    }
}
