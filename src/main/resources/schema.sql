PRAGMA foreign_keys = ON;

CREATE TABLE IF NOT EXISTS users (
    id TEXT PRIMARY KEY DEFAULT (
        lower(
            hex(randomblob(4)) || '-' ||
            hex(randomblob(2)) || '-' ||
            '4' || substr(hex(randomblob(2)), 2) || '-' ||
            substr('89ab', abs(random()) % 4 + 1, 1) ||
            substr(hex(randomblob(2)), 2) || '-' ||
            hex(randomblob(6))
        )
    ),
    username TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    display_name TEXT NOT NULL,
    role TEXT NOT NULL DEFAULT 'USER',
    enabled INTEGER NOT NULL DEFAULT 1,
    created_at INTEGER NOT NULL
);


CREATE TABLE IF NOT EXISTS pages (
    id TEXT PRIMARY KEY,
    slug TEXT NOT NULL UNIQUE,
    title TEXT NOT NULL,
    markdown TEXT NOT NULL,
    rendered_html TEXT NOT NULL,
    owner_id TEXT NOT NULL,
    created_at INTEGER NOT NULL,
    updated_at INTEGER NOT NULL,

    FOREIGN KEY (owner_id)
        REFERENCES users(id)
        ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_pages_owner
    ON pages(owner_id);

CREATE INDEX IF NOT EXISTS idx_pages_updated
    ON pages(updated_at DESC);

CREATE INDEX IF NOT EXISTS idx_pages_title
    ON pages(title);

CREATE INDEX IF NOT EXISTS idx_pages_slug
    ON pages(slug);
